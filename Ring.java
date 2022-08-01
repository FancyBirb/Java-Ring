import java.util.NoSuchElementException; // für die exeptions 

class Ring<T>{ 
private int size; // um die größe im blick zu behalten
private int actualE=0; // das aktuelle element welches sich mit back verkleinert 
private Object[] ring; // hier wird der Ring deklariert und kann als typ objekt andere Datentypen aufnehmen

Ring(int cap){   // der erste Konstruktor und letzte 
        if (cap<=0){    
            throw new IllegalArgumentException("nur Positive zahlen"); // wie es die aufgabe verlangt bei negativen zahlen (cap<=0) wird die exeption geworfen
    }       
    ring =  new Object[cap]; // wenn die exeption nicht geworfen wird, wird dem ring die größe übergeben
}

public static void main(String[] args){
    // ring exeption wenn negative größe übergeben wird
   try{
    Ring<Integer> r = new Ring<Integer>(-1);
    }catch(Exception a){System.out.println(a.getMessage());}

    // ToString / back / add in integers
    Ring<Integer> r = new Ring<Integer>(4);
    System.out.println("capacity:"+ r.capacity());
    System.out.println("size:"+r.size());   
    System.out.println("Integer ring");
    System.out.println("add() Test and toString() Test");
    r.add(1);
    System.out.println(r.toString());
    r.add(2);
    r.add(3);
    r.add(4);
    System.out.println(r.toString());
    // Exeption ring ist voll
    try{
        System.out.println("Capacity ist:"+r.capacity());
        r.add(5);
    }catch(Exception a){
        System.out.println("a.add() geht nicht weil: "+a.getMessage());}

    System.out.println("_________________________________");

    // Ring back() funktion
    System.out.println("Int ring back()+add()");
    Ring<Integer> r1 = new Ring<Integer>(4);
    r1.add(1);
    r1.add(2);
    r1.add(3);
    r1.back();
    r1.add(4);
    System.out.println(r1.toString());
    r1.back();
    r1.back();
    r1.back();
    System.out.println(r1.toString()); // die drei ist vor der 4(links eingefügt)
    
    // exeption ring = 0 und back 
    System.out.println("Back() test bei capacity = 0");
    try{
        Ring<Integer> rmüll = new Ring<Integer>(0);
        System.out.println("Capacity ist:"+rmüll.capacity());
        rmüll.back();;
    }catch(Exception a){System.out.println("Exeption mit back() ist:0 "+a.getMessage());}
    
    System.out.println("_______________________________________");
    
    // remove()Testen 
    System.out.println("Remove() Test mit integer ring: r1");
    System.out.println(r1.toString());
    System.out.println(r1.remove());
    System.out.println(r1.toString());
    r1.remove();
    System.out.println(r1.toString());
    r1.remove();
    System.out.println(r1.toString());
    r1.remove();
    System.out.println(r1.toString());
    System.out.println("jetzt noch ein besonderer testfall für remove() + back der mich sehr lange zeit gekostet hat ihn zu beheben");
    
    Ring<Integer> o= new Ring<Integer>(4);
    o.add(1);
    o.add(2);
    o.add(3);
    o.add(4);
    System.out.println(o.toString());
    o.remove();
    System.out.println(o.toString());
    o.back();
    System.out.println("nach einmal back gehen"+ o.toString());
    o.remove();
    System.out.println(o.toString());
    o.remove();
    System.out.println(o.toString());
    o.remove();
    
    // leerer Ring remove() exeption
    try{
        Ring<Integer> rmüll = new Ring<Integer>(0);
        System.out.println("Capacity ist:"+rmüll.capacity());
        rmüll.remove();
    }catch(Exception a){System.out.println("Exeption mit remove(), capacity ist: 0 "+a.getMessage());}
    System.out.println("_______________________________________");
    
    // Set() kommt jetzt
    System.out.println("Set(9) => toString() von ring r1 und aus 1234 sollte zu 2349 werden");
    // erstmal wieder auffüllen 
    r1.add(1);
    r1.add(2);
    r1.add(3);
    r1.add(4);
    System.out.println(r1.toString());
    r1.set(9);
    System.out.println(r1.toString());
    System.out.println("____________________________________");

// jetzt kommt das testen mit String Rings

    // ToString / back / add in String Ring
    Ring<String> rR = new Ring<String>(4);
    System.out.println("capacity:"+ rR.capacity());
    System.out.println("size:"+rR.size());   
    System.out.println("String ring");
    System.out.println("add() Test and toString() Test");
    rR.add("hund");
    System.out.println(rR.toString());
    rR.add("katze");
    rR.add("maus");
    rR.add("pferd");
   
    System.out.println(rR.toString());
    //set()
    System.out.println("set(vogel)__________________________-");
    rR.set("vogel");
    System.out.println(rR.toString());
    System.out.println("_________________________________");

    // Ring back() funktion
    System.out.println("Stirng ring back() and remove()");
    rR.back();
    System.out.println(rR.toString()); 
    // string ring remove 
    rR.remove();
    System.out.println(rR.toString()); 

    System.out.println("__________________________________");
    System.out.println("Tests mit Double Ring");
    
    // ring mit Double test
    
    // ring exeption wenn negative größe übergeben wird
    try{
    Ring<Double> müll = new Ring<Double>(-1);
    }catch(Exception a){System.out.println(a.getMessage());}

    // ToString / back / add in integers
    Ring<Double> S = new Ring<Double>(4);
    System.out.println("capacity:"+ S.capacity());
    System.out.println("size:"+S.size());   
    System.out.println("Integer ring");
    System.out.println("add() Test and toString() Test");
    S.add(0.3);
    System.out.println(r.toString());
    S.add(0.1);
    S.add(3.1);
    S.add(4.0);
    System.out.println(S.toString());
    // Exeption ring ist voll
    try{
        System.out.println("Capacity ist:"+S.capacity());
        S.add(5.0);
    }catch(Exception a){
        System.out.println("a.add() geht nicht weil: "+a.getMessage());}

    System.out.println("_________________________________");

    // Ring back() funktion
    System.out.println("Double ring back()+add()");
    Ring<Double> d1 = new Ring<Double>(4);
    d1.add(1.3);
    d1.add(2.3);
    d1.add(3.2);
    d1.back();
    d1.add(4.0);
    System.out.println(d1.toString());
    d1.back();
    d1.back();
    d1.back();
    System.out.println(d1.toString()); // die drei ist vor der 4(links eingefügt)
    
    // exeption ring = 0 und back 
    System.out.println("Back() test bei capacity = 0");
    try{
        Ring<Double> rmüll = new Ring<Double>(0);
        System.out.println("Capacity ist:"+rmüll.capacity());
        rmüll.back();;
    }catch(Exception a){System.out.println("Exeption mit back() ist:0 "+a.getMessage());}
    
    System.out.println("_______________________________________");
    
    // remove()Testen 
    System.out.println("Remove() Test mit integer ring: r1");
    System.out.println(d1.toString());
    System.out.println(d1.remove());
    System.out.println(d1.toString());
    d1.remove();
    System.out.println(d1.toString());
    d1.remove();
    System.out.println(d1.toString());
    d1.remove();
    System.out.println(d1.toString());
    System.out.println("jetzt noch ein besonderer testfall für remove() + back() in Double ring, der mich sehr lange zeit gebracuht hat ihn zu beheben");
    
    Ring<Double> o1 = new Ring<Double>(4);
    o1.add(1.5);
    o1.add(2.5);
    o1.add(3.4);
    o1.add(4.8);
    System.out.println(o1.toString());
    o1.remove();
    System.out.println(o1.toString());
    o1.back();
    System.out.println("nach einmal back gehen"+ o1.toString());
    o1.remove();
    System.out.println(o1.toString());
    o1.remove();
    System.out.println(o1.toString());
    o1.remove();
    
    // leerer Double Ring remove() exeption
    try{
        Ring<Double> rmüll = new Ring<Double>(0);
        System.out.println("Capacity ist:"+rmüll.capacity());
        rmüll.remove();
    }catch(Exception a){System.out.println("Exeption mit remove(), capacity ist: 0 "+a.getMessage());}
    System.out.println("_______________________________________");
    
    // Set() kommt jetzt
    System.out.println("Set(9.4) => toString()");
    // erstmal wieder auffüllen 
    d1.add(1.2);
    d1.add(2.7);
    d1.add(3.8);
    d1.add(4.3);
    System.out.println(d1.toString());
    d1.set(9.5);
    System.out.println(d1.toString());
    System.out.println("____________________________________");





    System.out.println("Ring in Ringe<String>");

    //das große final, der ring mit 5 ringe verkettet
    Ring<Ring> Primary = new Ring<Ring>(5);
    Ring<String> S1= new Ring<String>(5);
    Ring<String> S2= new Ring<String>(5);// s for secondary 
    Ring<String> S3= new Ring<String>(5);
    Ring<String> S4= new Ring<String>(5);
    Ring<String> S5= new Ring<String>(5);

    S1.add("Hund1");
    S1.add("Hund2");
    S1.add("Hund3");
    S1.add("Hund4");
    S1.add("Hund5");

    S2.add("Katze1");
    S2.add("Katze2");
    S2.add("Katze3");
    S2.add("Katze4");
    S2.add("Katze5");

    S3.add("Pferd1");
    S3.add("Pferd2");
    S3.add("Pferd3");
    S3.add("Pferd4");
    S3.add("Pferd5");

    S4.add("maus1");
    S4.add("maus2");
    S4.add("maus3");
    S4.add("maus4");
    S4.add("maus5");

    S5.add("aal1");
    S5.add("aal2");
    S5.add("aal3");
    S5.add("aal4");
    S5.add("aal5");

    Primary.add(S1);
    Primary.add(S2);
    Primary.add(S3);
    Primary.add(S4);
    Primary.add(S5);

    System.out.println(Primary.toString());
    Primary.remove();
    System.out.println(Primary.toString());
    Primary.back();
    System.out.println(Primary.toString());
    Ring<String> ersatz = new Ring<String>(5);
    ersatz.add("1");
    ersatz.add("2");
    ersatz.add("3");
    ersatz.add("4");
    ersatz.add("5");

    Primary.set(ersatz);
    System.out.println(Primary.toString());


}

int size(){
    return size; // wie ein get methode gibt die size wieder
}

int capacity(){
    return ring.length; // gibt dann die länge des arrays wieder
}

void add(T t){
    if(size()==capacity()){ // hier ist die exeption wenn der ring voll ist 
        throw new IllegalArgumentException("Ring is Full");
    }

    if (size()==0){ // hier wird dass erste element eingefügt 
    ring[actualE] = t;
    this.size++;// und die größe aktualisiert 


}
else{ // sollte der ring schon ein element haben, muss bei meiner implementation paar sachen beachtet werden ps. ich glaube ich habe es mit unnötig schwer gemacht, ich hätte einfach den ring rotieren lassen sollen, jedoch wollte ich alles in place haben 
    if (size()>=1){
        
        
        if (ring[((actualE+size)%capacity())]==null){ //((actualE+size)%capacity()) ist notwendig damit ich im array wieder von vorne anfangen kann
            ring[((actualE+size)%capacity())]=t;                     // fügt einfach hinten im array die eletment an wenn es lehr ist 
            size++;   
        }
        else{
        //gucken wo das letzte element im array ist
        int i=capacity()-1;
        while(ring[i]==null){
            i--;
        }   // jetzt zeigt i auf das letzte element im array 
        //Verrücken des arrays kommt jetzt
        for(int k=i; k>=actualE-1;k--){ // hier benötige ich das i dann um platz für das neue element zu machen, damit es dann links eingefügt werden kann
            ring[k+1]=ring[k];
        }
        
        ring[actualE]=t; // nun füge ich es das element im freien platz ein 
        actualE= (actualE+1)%(capacity()); // und verschiebe den "Zeiger" aufs aktuellemetn nach rechts, damit das aktuelle Element unverändert bleibt
        size++; // dazu aktuallisieren wir die größe des rings
        }
    }
}
}
/* 
quu..__
 $$$b  `---.__
  "$$b        `--.                          ___.---uuudP
   `$$b           `.__.------.__     __.---'      $$$$"              .
     "$b          -'            `-.-'            $$$"              .'|
       ".                                       d$"             _.'  |
         `.   /                              ..."             .'     |
           `./                           ..::-'            _.'       |
            /                         .:::-'            .-'         .'
           :                          ::''\          _.'            |
          .' .-.             .-.           `.      .'               |
          : /'$$|           .@"$\           `.   .'              _.-'
         .'|$u$$|          |$$,$$|           |  <            _.-'
         | `:$$:'          :$$$$$:           `.  `.       .-'
         :                  `"--'             |    `-.     \
        :##.       ==             .###.       `.      `.    `\
        |##:                      :###:        |        >     >
        |#'     `..'`..'          `###'        x:      /     /
         \                                   xXX|     /    ./
          \                                xXXX'|    /   ./
          /`-.                                  `.  /   /
         :    `-  ...........,                   | /  .'
         |         ``:::::::'       .            |<    `.
         |             ```          |           x| \ `.:``.
         |                         .'    /'   xXX|  `:`M`M':.
         |    |                    ;    /:' xXXX'|  -'MMMMM:'
         `.  .'                   :    /:'       |-'MMMM.-'
          |  |                   .'   /'        .'MMM.-'
          `'`'                   :  ,'          |MMM<
            |                     `'            |tbap\
             \                                  :MM.-'
              \                 |              .''
               \.               `.            /
                /     .:::::::.. :           /
               |     .:::::::::::`.         /
               |   .:::------------\       /
              /   .''               >::'  /
              `',:                 :    .'
                                   `:.:' 
You found a frindly reminder to stay hydrated :) 
                                   */
 
void back(){
    if(size()==0){// wieder die nötige exeption wenn die grö0e null ist
        throw new NoSuchElementException("Ring leer");
    }
    // ich muss bei dem back nur das actualE verkleinern und den fall bedenken wenn aktualE = 0 ist, dass es direkt wieder zum ende vom array springt, wass actualE = capacity()-1 wäre
   int i = actualE; // hilfs variable
   if (actualE== 0){
    i = capacity()-1;// hier springt actualE dann zum ende vom array, wenn es vorher bei 0 war
    }
    else{
        i--; // ansonsten müssen wir es nur verkleinern
    }
    while(ring[i]==null){ // da wir nur auf elemente im ring zeigen wolllen die gefüllt sind müssen wir alle null element aussortieren
        i = (i-1)%(capacity()-1); // hier ist vorsichtshalber mit modulo damit er wieder von vorne anfangen kann
    }
    this.actualE = i; // und schlussenlich dann das initialiesieren des neuen actualE
}

T remove(){
    T tmp = (T) ring[actualE]; // das später zurück zugebene element 
    if (size()==0){ // naja exeption für den fall das der ring leer ist
        throw new NoSuchElementException("Ring leer");
    }
    else{
        int i = 0;
        while(i < capacity()-1){ // wir wollen einmal der länge des rings nach links verschieben 
            ring[(actualE+i)%(capacity())]= ring[(actualE+i+1)%(capacity())];//das vorrücken des arrays und immer mit % rest damit wir wieder am anfang vom array anfangen können
            i++;
        }
        int u = ((actualE-1) < 0) ? (capacity() - (Math.abs((actualE-1)) % capacity()) ) %capacity() : ((actualE-1) % capacity()); // ich benötige ein Modulo operator der mit Negativen zahlen umgehnen kann und die % operation giebt nur den rest wieder und kann dadurch -1 nicht handhaben, diesen fehler herrauszufinden hat mich 5 stunden gedauert 
        ring[u]=null; // nun löscht man das letzte doppelte übriggebliebene element im array damit es sich nicht weiter kopiert 
        this.size--; // die size updaten
    
        if(ring[actualE]==null){ // actualE muss auf ein eElement zeigen, also sollte es auf ein null zeigen wird es weiter geführt bis es auf ein gültiges Element zeigt
        actualE = (actualE+1)%(capacity()); 
        }
        
    return tmp; // falls system.out.print kommt wirda das gelöschte element zurück gegeben 
    }
}

void set(T t){
    if(size()==0){ // Exeption wenn size = 0 ist 
        throw new NoSuchElementException("ring ist leer");
    }
    else{
        ring[actualE]=t;// setzten von actualE zum neuen t 
        if (actualE==capacity()-1){ // checken ob aktual sich am ende vom arr befindet
            actualE=0; /// wenn ja dann muss actualE auf null gesetzt werden umd wieder am anfang zu stehen
        }
        else{// andernfalls einfach erhöhern damit actualE zum rechten element wird 
        actualE++;
        }    
    }
}

public String toString(){
    String tmp= "Ring is: "; // grund gerüst für die ausgabe 
  
    for (int i =0 ; i<capacity();i++){
        if (ring[(actualE+i)%(capacity())]==null){ // fischt die null´s aus dem array und tut nichts damit 
        }
        else{
        tmp +=" "+ ring[(actualE+i)%(capacity())]; // und wenn der Array am index nicht leer ist dann wirds dem tmp zugefügt der es dannach returnt 
        }
     
    }



return tmp; //Die Ausgabe
}
}
/* Duck with a cap 
quack 
⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⠿⠿⠿⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⣉⡥⠶⢶⣿⣿⣿⣿⣷⣆⠉⠛⠿⣿⣿⣿⣿⣿⣿⣿
⣿⣿⣿⣿⣿⣿⣿⡿⢡⡞⠁⠀⠀⠤⠈⠿⠿⠿⠿⣿⠀⢻⣦⡈⠻⣿⣿⣿⣿⣿
⣿⣿⣿⣿⣿⣿⣿⡇⠘⡁⠀⢀⣀⣀⣀⣈⣁⣐⡒⠢⢤⡈⠛⢿⡄⠻⣿⣿⣿⣿
⣿⣿⣿⣿⣿⣿⣿⡇⠀⢀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣶⣄⠉⠐⠄⡈⢀⣿⣿⣿⣿
⣿⣿⣿⣿⣿⣿⣿⠇⢠⣿⣿⣿⣿⡿⢿⣿⣿⣿⠁⢈⣿⡄⠀⢀⣀⠸⣿⣿⣿⣿
⣿⣿⣿⣿⡿⠟⣡⣶⣶⣬⣭⣥⣴⠀⣾⣿⣿⣿⣶⣾⣿⣧⠀⣼⣿⣷⣌⡻⢿⣿
⣿⣿⠟⣋⣴⣾⣿⣿⣿⣿⣿⣿⣿⡇⢿⣿⣿⣿⣿⣿⣿⡿⢸⣿⣿⣿⣿⣷⠄⢻
⡏⠰⢾⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⢂⣭⣿⣿⣿⣿⣿⠇⠘⠛⠛⢉⣉⣠⣴⣾
⣿⣷⣦⣬⣍⣉⣉⣛⣛⣉⠉⣤⣶⣾⣿⣿⣿⣿⣿⣿⡿⢰⣿⣿⣿⣿⣿⣿⣿⣿
⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⡘⣿⣿⣿⣿⣿⣿⣿⣿⡇⣼⣿⣿⣿⣿⣿⣿⣿⣿
⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇⢸⣿⣿⣿⣿⣿⣿⣿⠁⣿⣿⣿⣿⣿⣿⣿⣿⣿
 */
