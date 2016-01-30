package dawid.libgdxlomboktest;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;

import lombok.Getter;
import lombok.Setter;

public class LibgdxLombokTest extends ApplicationAdapter {

	Test test = new Test();

	@Override
	public void render () {
		Gdx.app.log("delta", Float.toString(test.getDelta()));
		test.setDelta(Gdx.graphics.getDeltaTime());
	}

	@Getter
	@Setter
	static class Test {
		private float delta = 0;
	}
}
