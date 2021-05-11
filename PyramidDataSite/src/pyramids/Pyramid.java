package pyramids;

public class Pyramid {
//	Height index 7
//	Modern name index 2
//	Pharaoh  index 0
//	Site index 4
	
	private double height;
	private String modernName;
	private String pharaoh;
	private String site;
	public Pyramid(double height, String modernName, String pharaoh, String site) {
		super();
		this.height = height;
		this.modernName = modernName;
		this.pharaoh = pharaoh;
		this.site = site;
	}
	public Pyramid() {
		
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getModernName() {
		return modernName;
	}
	public void setModernName(String modernName) {
		this.modernName = modernName;
	}
	public String getPharaoh() {
		return pharaoh;
	}
	public void setPharaoh(String pharaoh) {
		this.pharaoh = pharaoh;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	@Override
	public String toString() {
		return "Pyramid [height=" + height + ", modernName=" + modernName + ", pharaoh=" + pharaoh + ", site=" + site
				+ "]";
	}
	
	
	

}
