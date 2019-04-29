package SEDay01;

public class user<E>{
    E user_num;
    public E getUser_num() {
        return user_num;
    }

    public void setUser_num(E user_num) {
        this.user_num = user_num;
    }
  public<E> void showUser(E user_id){
      System.out.println(user_id);
  }
}
