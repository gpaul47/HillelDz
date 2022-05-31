public class Main { //Dz27
    public static void main(String[] args) {
        Wind wind = new Wind();
        River river = new River();
        wind.getElementName();
        river.getElementName();
        System.out.println();
       identifyElement(wind);
       identifyElement(river);

    }
    public static void identifyElement(IElement i) {
        i.getElementName();
    }
}
