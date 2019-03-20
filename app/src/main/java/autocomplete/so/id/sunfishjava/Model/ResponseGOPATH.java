package autocomplete.so.id.sunfishjava.Model;

import com.google.gson.annotations.SerializedName;

public class ResponseGOPATH{

	@SerializedName("ERRMSG")
	private String eRRMSG;

	@SerializedName("DATA")
	private DATA dATA;

	@SerializedName("RESULT")
	private boolean rESULT;

	public void setERRMSG(String eRRMSG){
		this.eRRMSG = eRRMSG;
	}

	public String getERRMSG(){
		return eRRMSG;
	}

	public void setDATA(DATA dATA){
		this.dATA = dATA;
	}

	public DATA getDATA(){
		return dATA;
	}

	public void setRESULT(boolean rESULT){
		this.rESULT = rESULT;
	}

	public boolean isRESULT(){
		return rESULT;
	}

	@Override
 	public String toString(){
		return 
			"ResponseGOPATH{" + 
			"eRRMSG = '" + eRRMSG + '\'' + 
			",dATA = '" + dATA + '\'' + 
			",rESULT = '" + rESULT + '\'' + 
			"}";
		}
}