package examples.challenge1;

import net.sf.clipsrules.jni.*;


public class TestCLIPSJava {

	public static void main(String args[]) throws Exception {
		Environment clips;

		clips = new Environment();

		clips.eval("(assert (hola-mundo))");
		clips.load("forTestJava.clp");
		clips.eval("(reset)");
		clips.eval("(facts)");
		clips.run();
	}
}