package Adapter;

import java.rmi.RemoteException;
import java.time.ZoneId;

import Utils.Utils;
import kodlamaio_game_crm.Abstract.GamerCheckService;
import kodlamaio_game_crm.Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerCheckService
{
    KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();

    public boolean checkIfRealPerson(Gamer gamer) {
		try {
			boolean result = kpsPublicSoapProxy.TCKimlikNoDogrula(
					Long.parseLong(gamer.getNationalityId()),
					gamer.getFirstName().toUpperCase(),
					gamer.getLastName().toUpperCase(), 
					gamer.getDateOfBirth().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear()
					);
			Utils.MessageBox("Gamer N.Id ="+Long.parseLong(gamer.getNationalityId()));
			Utils.MessageBox("FirstName  ="+gamer.getFirstName().toUpperCase());
			Utils.MessageBox("LastName   ="+gamer.getLastName().toUpperCase());
			Utils.MessageBox("Year       ="+gamer.getDateOfBirth().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear());
			Utils.MessageBox("MERNIS result ="+result);

			return result;
		} 
		catch (RemoteException e) {
			e.printStackTrace();
			Utils.MessageBox(e.getLocalizedMessage());
			return false;
		}
	}
}