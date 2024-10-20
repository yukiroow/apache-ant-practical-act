package misc;

/**
 * [8 Kyu]
 * In this first kata in the series, you need to define a
 * Hero prototype to be used in a terminal game.
 */
public class Hero {
  String name = "Hero";
  String position = "00";
  int health = 100;
  int damage = 5;
  int experience = 0;

  public Hero(String name) {
    this.name = name;
  }

  public Hero() {
    super();
  }
}