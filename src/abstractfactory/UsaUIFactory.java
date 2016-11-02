package abstractfactory;

class UsaUIFactory implements UIAbstractFactory{

	@Override
	public Help getHelp() {
		return new UsaHelpImpl();
	}

	@Override
	public Images getImages() {
		return new UsaImagesImpl();
	}

	@Override
	public Locale getLocale() {
		return new UsaLocaleImpl();
	}
	
}
