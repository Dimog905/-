public class Laba2 {
  public static void main(String[] args) {
  Laba2 l1 = new Laba2(4, 3);
  l1.Branches();
  l1.Array();
}
  int level;
  int offset;

  public Laba2(int _level, int _offset){
    level = _level;
    offset = _offset;
  }
  public void Branches(){
  for (int i = 0; i < level; i++) {
    for (int j = 0; j < level - i; j++)
      System.out.print(" ");
    for (int k = 0; k < (2*i + 1); k++)
      System.out.print("*");
      System.out.println();
  }
 }
  public void Array(){
  int[][] arr = { { 0, 0 }, { 0, 0 } };
  int current = 0;
  for (int i = 0; i < 2; i++) {
    for (int j = 0; j < 2; j++) {
      arr[i][j] = current;
      current += offset;
    }
      System.out.println();
  }
  for (int i = 0; i < 2; i++) {
    for (int j = 0; j < 2; j++) {
        System.out.print(arr[i][j] + " ");
    }
      System.out.println();
  }
 }


}
