package finalProject;

public class gameTitle<T, U>  
//Max Crutchfield
	// red id: 822330295
	// 05/14/20

// This is my use of Generics to name the String name of the game 
// and the Integer representing the number game it is
{ 
    T obj1;  // An object of type T 
    U obj2;  // An object of type U 
  
    
    gameTitle(T obj1, U obj2) 
    { 
        this.obj1 = obj1; 
        this.obj2 = obj2; 
    } 
  
     
    public void print() 
    { 
        System.out.print(obj1 + " "); 
        System.out.println(obj2); 
    } 
} 
  
 
