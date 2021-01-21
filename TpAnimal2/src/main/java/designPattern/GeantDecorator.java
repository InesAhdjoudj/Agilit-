package designPattern;

public class GeantDecorator extends CharacterDecorator {

	public GeantDecorator(CharacterFictif characterFictif) {
		super(characterFictif);
	}
	
	@Override
	public void subir(int pdv) {
		super.subir((int)(pdv - (pdv*0.5)));
	}

}
