package examples.clips;

import net.sf.clipsrules.jni.Environment;


public class demo {

	public static void main(String s[]) throws Exception {
		Environment clips;

		clips = new Environment();
        try{
            System.out.println("HELLO WORLD");
			clips.eval("(clear)");
			clips.eval("(assert (animal duck))");
			clips.eval("(assert (animal dog))");
			clips.eval("(facts)");
			clips.run();
        }
		catch(Exception e) {}
	}
}