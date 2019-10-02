package PRAC1_ex2;

/**
 * This class represents a Team of BalUOCesto game.
 * @author David García Solórzano
 * @version 1.0
 */
public class Team{
	/**
	 * Team's short name, e.g. Barça.	
	 */
	private String shortName;
	/**
	 * Team's long name, e.g. F.C. Barcelona.
	 */	
	private String longName;
	/**
	 * Image source.
	 */	
	private String imageSrc;
	/**
	 *  President's name.
	 */
	private String president;
	/**
	 *  Sponsor's name.
	 */
	private String sponsor;
	/**
	 * Team's members.
	 */	 
	private int members;
	/**
	 * Team's budget. It is "int" because data are from 1996, when Pesetas was the official coin in Spain.
	*/
	private int budget;
	/**
	 * Team's foundation year.
	*/
	private int founded;
		
	/**
	 * Default constructor. It assigns the default value to all the instance's fields/attributes.
	 * @throws Exception When shortName is longer than 40 characters, members less than 0, budget less than 0 or founded less than 1900.
	 */
	public Team() throws Exception{
		this("Default", "Team Default", "./", "Dummy", "UOC",1000,1000000,2019);
	}	
	/**
	 * Constructor with arguments.
	 * @param shortName Team's short name.
	 * @param longName Team's long name.
	 * @param imageSrc Source where the team's image is.
	 * @param president President's name.
	 * @param sponsor Sponsor's name.
	 * @param members Number of members.
	 * @param budget Team's budget.
	 * @param founded Foundation year.
	 * @throws Exception When shortName is longer than 40 characters, members less than 0, budget less than 0 or founded less than 1900.
	 */
	public Team(String shortName, String longName, String imageSrc, String president, String sponsor, int members, int budget, int founded) throws Exception{
		setShortName(shortName);
		setLongName(longName);
		setImageSrc(imageSrc);
		setPresident(president);
		setSponsor(sponsor);
		setMembers(members);
		setBudget(budget);
		setFounded(founded);
	}	
	/**
	 * It is shortname's getter.
	 * @return Team's short name.
	 */
	public String getShortName() {
		return shortName;
	}
	/**
	 * It is shortname's setter.
	 * @param shortName Team's short name.
	 * @throws Exception When param "shortName" is longer than 40 characters.
	 */
	public void setShortName(String shortName) throws Exception{
		if(shortName.length()>40) {
			throw new Exception("[ERROR] Short name cannot be longer than 40 characters!!");
		}
		
		this.shortName = shortName;
	}
	/**
	 * It is longname's getter.
	 * @return Team's long name.
	 */
	public String getLongName() {
		return longName;
	}
	/**
	 * It is shortname's setter.
	 * @param longName Team's long name.
	 */
	public void setLongName(String longName) {		
		this.longName = longName;
	}
	/**
	 * It is imageSrc's getter. 
	 * @return Source where the team's image is.
	 */
	public String getImageSrc() {
		return imageSrc;
	}
	/**
	 * It is imageSrc's setter.  
	 * @param imageSrc Source where the team's image is.
	 */
	public void setImageSrc(String imageSrc) {
		this.imageSrc = imageSrc;
	}
	/**
	 * It is president's getter. 
	 * @return President's name.
	 */
	public String getPresident() {
		return president;
	}
	/**
	 * It is president's setter. 
	 * @param president President's name.
	 */
	public void setPresident(String president) {
		this.president = president;
	}
	/**
	 * It is sponsor's getter. 
	 * @return Sponsor's name.
	 */
	public String getSponsor() {
		return sponsor;
	}
	/**
	 * It is sponsor's setter. 
	 * @param sponsor Sponsor's name.
	 */
	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;
	}
	/**
	 * It is member's getter. 
	 * @return Number of members in the team.
	 */
	public int getMembers() {
		return members;
	}
	/**
	 * It is member's setter.
	 * @param members Number of members in the team.
	 * @throws Exception When param "members" is less than 0.
	 */
	public void setMembers(int members) throws Exception{
		if(members<0) {
			throw new Exception("[ERROR] Members must be equal or greater than 0!!");
		}
		this.members = members;		
	}
	/**
	 * It is budget's getter. 
	 * @return Team's budget.
	 */
	public int getBudget() {
		return budget;
	}
	/**
	 * It is budget's setter. 
	 * @param budget Team's budget.
	 * @throws Exception When param "budget" is less than 0.
	 */
	public void setBudget(int budget) throws Exception{
		if(budget<0) {
			throw new Exception("[ERROR] Budget must be equal or greater than 0!!");
		}
		this.budget = budget;		
	}
	/**
	 * It is foundation year (founded)'s getter.
	 * @return Team's foundation year.
	 */
	public int getFounded() {
		return founded;
	}
	/**
	 * It is foundation year (founded)'s setter.
	 * @param founded Team's foundation year.
	 * @throws Exception When para "founded" is less than 0.
	 */
	public void setFounded(int founded) throws Exception{
		if(founded<1900) {
			throw new Exception("[ERROR] Year foundation must be equal or greater than 1900!!");
		}
		this.founded = founded;		
	}
}
