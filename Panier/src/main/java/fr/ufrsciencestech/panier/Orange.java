public class Orange{

	double prix;
	String origine;

	public Orange(double p, String o){
		if(p>=0){
			this.prix=p;
			this.origine=o;
		}
		else
			System.out.println("Insérez un prix positif pour l'orange du marchand. UI, on a aussi homme et petit garçon à l'étage.");
	}	
	
	public double getPrix(){
		return this.prix;		
	}
	
	public String getOrigine(){
		return this.origine;	
	}
	
	public static void main(String[] args){
	
		Orange o=new Orange(50,"Atlantide");
		
		Orange orangedepauvre=new Orange(2,"Roséfluant");
		
		Orange antio=new Orange(-50,"DefinitelyNotAtlantide");
		
		System.out.println(o.origine);
		
		System.out.println(o.prix);
		
		System.out.println(orangedepauvre.origine);	
	
	
	}
}