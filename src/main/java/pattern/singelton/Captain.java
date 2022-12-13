package pattern.singelton;
/*
Lazy initialization
cannot have subclass
 */
final class Captain {
    private static Captain captain;
//Making the constructor private to prevent the use of "new"
    private Captain(){}
/*
Two (or more) threads may try to evaluate the
following code at the same time.
So, using lazy initialization, you delay the
object creation process to avoid expensive processes to create an object
 */
    public static synchronized Captain getCaptain(){
        //Lazy initialization
        if (captain == null){
            captain = new Captain();
        }else {
            System.out.println("Already have a cap");
        }
        return captain;
    }
}
