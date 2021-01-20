package design_pattern;

public class NainDecorator extends CharacterDecorator {

	public NainDecorator(CharacterFictif characterFictif) {
		super(characterFictif);
	}
	@Override
	public void subir(int pdv) {
		super.subir((int)(pdv + (pdv*0.5)));
	}
}
