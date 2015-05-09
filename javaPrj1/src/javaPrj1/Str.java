package javaPrj1;

public class Str {
  String x;
  
  public Str(String s) {
	  x = s;
  }
  
  public String getStr() {
	  return x;
  }
  public void setStr(String s) {
	  x = s;
  }
  
  public String toString()
  {
	 return "Str_"+x;
  }
  
}
