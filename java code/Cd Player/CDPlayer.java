
package javaapplication41;


public class CDPlayer implements Player {
    
    public void play (){
    
    System.out.println("Start Playing");
    }
    
    public void stop(){
        System.out.println("Stop The Music");
    
    }
    public void pause(){
    
        System.out.println("Pause The Music");
    }
    public void reverse(){
    
        System.out.println("Reverse the music");
    }
    public void audio(){
    
        System.out.println("I play audio only");
    }
    
}
