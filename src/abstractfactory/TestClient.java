package abstractfactory;

class TestClient {
	void run(String countryId){
		UIAbstractFactory uiFactory = null;
		if(countryId.equals("JP"))
			uiFactory = new JapaneseUIFactory();
		if(countryId.equals("US"))
			uiFactory = new UsaUIFactory();
		
		if(uiFactory != null){
			Help help = uiFactory.getHelp();
			System.out.println("help created for: " + help.getHelpCountry());
			
			Images images = uiFactory.getImages();
			System.out.println("UI images created for: " + images.getImagesCountry());
			
			Locale locale = uiFactory.getLocale();
			System.out.println("UI locale created for: " + locale.getLocaleCountry());
		}else{
			System.out.println("Wrong country id");
		}
	}
}
