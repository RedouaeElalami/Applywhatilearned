package LearningClassesObjectsConstructors;

import java.time.LocalDate;

public class ClassImplementing
{
	public static void main(String[] args)
	{
		LearningStaticMethodProperties x = new LearningStaticMethodProperties();
		LearningStaticMethodProperties.NOMBRE_OF_PERSONES=3;
		//

		Personne redouane = new Personne(26,
											"Redouane",
											"Elalami",
											"Paris",
											LocalDate.of(1992,9,19));
		int age = redouane.getAge();
		System.out.println("age = " + age);

		Personne unkonwn = new Personne("Cristano","Ronaldo");
		unkonwn.setAge(33);
		int age1 = unkonwn.getAge();
		System.out.println("age1 = " + age1);

		Mylamda r = () -> System.out.println("lamda expression sout ");

		//Anonymous inner class (inside a class and that has not have name), does the same thing as lambda expression
		Mylamda lamdaInnerClass = new Mylamda(){
			public void foo()
			{
				System.out.println("lamda expression sout ");
			}
		};

		System.out.println("-----------Execute Lambda -----------------");
		//to execute Lambda expression
		r.foo();
		lamdaInnerClass.foo();

		System.out.println("-----------Lambda in methods-----------------");

		//use it in a method
		ClassImplementing classImplementing = new ClassImplementing();
		classImplementing.greeter(r);
		classImplementing.greeter(lamdaInnerClass);

		System.out.println("--------------StringLength--------------");
		//IStringLengthInterface stringLength =(String d) -> d.length();
		IStringLengthInterface stringLength = d -> d.length();
		System.out.println("stringLengthMethod of Redouane = " + stringLength.stringLengthMethod("Redouane"));

		printStringLentth(j -> j.length());
	}

	public void greeter(Mylamda mylamda)
	{
		mylamda.foo();
	}

	public static void printStringLentth(IStringLengthInterface ls) {
		System.out.println(ls.stringLengthMethod("Cristiano Ronaldo"));

	}
}




