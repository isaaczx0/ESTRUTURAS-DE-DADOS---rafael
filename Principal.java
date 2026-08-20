public class Principal {
    public static void main(String[] args){
        No obj = new No("Rafael");

        obj.setNextNo(new No("Cecilia"));
        obj.getnextNo().setNextNo(new No("joaquim"));


        System.out.println(obj.getDado());
        System.out.println(obj.getnextNo().getDado());
        System.out.println(obj.getnextNo().getDado());


       No aux = obj;
       while(aux!=null){
            System.out.println(aux.getDado());
            aux = aux.getnextNo();
       } 
    }
}