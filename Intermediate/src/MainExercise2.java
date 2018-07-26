public class MainExercise2 {

	public static void main(String[] args) {
		//
		// BlackJClass blkj = new BlackJClass();
		// System.out.println(blkj.blkjk(21, 21));
		//
		// UniqueSum uSum = new UniqueSum();
		// System.out.println(uSum.operateThree(3,3,3));
		//
		// Temperature hot = new Temperature ();
		// System.out.println(hot.tooHot(100, true));
		//
		//
		//
		        People[] pArray = new People[5];
		
		        pArray[0] = new People("Ernest", 23, "Scientist");
                pArray[1] = new People("Esther", 23, "Astronaut");
                pArray[2] = new People("Bibek",21, "Doctor");
                pArray[3] = new People("Roy", 21, "Cowboy");
                pArray[4] = new People("Maran", 19, "Lawyer");

                for (int i = 0; i <pArray.length ; i++ ){
                System.out.println(pArray[i].getName());
                System.out.println(pArray[i].getAge());
                System.out.println(pArray[i].getJobTitle());
                System.out.println("------------------------------");
                }

                //Look for specific person
    
                System.out.println("Found the person!");
                System.out.println(pArray[2].getName());
                System.out.println(pArray[2].getAge());
                System.out.println(pArray[2].getJobTitle());
		

	}
}
