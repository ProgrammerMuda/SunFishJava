package autocomplete.so.id.sunfishjava.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DATA{

	@SerializedName("ACCOUNT")
	private String aCCOUNT;

	@SerializedName("MODE")
	private List<Object> mODE;

	@SerializedName("ACCOUNTNAME")
	private String aCCOUNTNAME;

	@SerializedName("CUSTOM")
	private List<Object> cUSTOM;

	@SerializedName("SFPATH")
	private String sFPATH;

	@SerializedName("IST")
	private String iST;

	@SerializedName("GOPATH")
	private String gOPATH;

	public void setACCOUNT(String aCCOUNT){
		this.aCCOUNT = aCCOUNT;
	}

	public String getACCOUNT(){
		return aCCOUNT;
	}

	public void setMODE(List<Object> mODE){
		this.mODE = mODE;
	}

	public List<Object> getMODE(){
		return mODE;
	}

	public void setACCOUNTNAME(String aCCOUNTNAME){
		this.aCCOUNTNAME = aCCOUNTNAME;
	}

	public String getACCOUNTNAME(){
		return aCCOUNTNAME;
	}

	public void setCUSTOM(List<Object> cUSTOM){
		this.cUSTOM = cUSTOM;
	}

	public List<Object> getCUSTOM(){
		return cUSTOM;
	}

	public void setSFPATH(String sFPATH){
		this.sFPATH = sFPATH;
	}

	public String getSFPATH(){
		return sFPATH;
	}

	public void setIST(String iST){
		this.iST = iST;
	}

	public String getIST(){
		return iST;
	}

	public void setGOPATH(String gOPATH){
		this.gOPATH = gOPATH;
	}

	public String getGOPATH(){
		return gOPATH;
	}

	@Override
 	public String toString(){
		return 
			"DATA{" + 
			"aCCOUNT = '" + aCCOUNT + '\'' + 
			",mODE = '" + mODE + '\'' + 
			",aCCOUNTNAME = '" + aCCOUNTNAME + '\'' + 
			",cUSTOM = '" + cUSTOM + '\'' + 
			",sFPATH = '" + sFPATH + '\'' + 
			",iST = '" + iST + '\'' + 
			",gOPATH = '" + gOPATH + '\'' + 
			"}";
		}
}