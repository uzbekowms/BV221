# Lombok

@Data - генерує конструктор, геттери, сеттери, методи equals, canEqual, hashCode, toString
```java
@Data
public class User {
    private String name;
    private int age;
    private float height;
    private float weight;
}
```
Перетворює на 
```java

public class User {
    private String name;
    private int age;
    private float height;
    private float weight;

    public User() {
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public float getHeight() {
        return this.height;
    }

    public float getWeight() {
        return this.weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof User)) {
            return false;
        } else {
            User other = (User)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getAge() != other.getAge()) {
                return false;
            } else if (Float.compare(this.getHeight(), other.getHeight()) != 0) {
                return false;
            } else if (Float.compare(this.getWeight(), other.getWeight()) != 0) {
                return false;
            } else {
                Object this$name = this.getName();
                Object other$name = other.getName();
                if (this$name == null) {
                    if (other$name != null) {
                        return false;
                    }
                } else if (!this$name.equals(other$name)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof User;
    }

    public int hashCode() {
        int PRIME = true;
        int result = 1;
        result = result * 59 + this.getAge();
        result = result * 59 + Float.floatToIntBits(this.getHeight());
        result = result * 59 + Float.floatToIntBits(this.getWeight());
        Object $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        return result;
    }

    public String toString() {
        String var10000 = this.getName();
        return "User(name=" + var10000 + ", age=" + this.getAge() + ", height=" + this.getHeight() + ", weight=" + this.getWeight() + ")";
    }
}
```
@Value
```java
@Value
public class User {
    private String name;
    private int age;
    private float height;
    private float weight;
}

```

```java
public final class User {
    private final String name;
    private final int age;
    private final float height;
    private final float weight;

    public User(String name, int age, float height, float weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public float getHeight() {
        return this.height;
    }

    public float getWeight() {
        return this.weight;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof User)) {
            return false;
        } else {
            User other = (User)o;
            if (this.getAge() != other.getAge()) {
                return false;
            } else if (Float.compare(this.getHeight(), other.getHeight()) != 0) {
                return false;
            } else if (Float.compare(this.getWeight(), other.getWeight()) != 0) {
                return false;
            } else {
                Object this$name = this.getName();
                Object other$name = other.getName();
                if (this$name == null) {
                    if (other$name == null) {
                        return true;
                    }
                } else if (this$name.equals(other$name)) {
                    return true;
                }

                return false;
            }
        }
    }

    public int hashCode() {
        int PRIME = true;
        int result = 1;
        result = result * 59 + this.getAge();
        result = result * 59 + Float.floatToIntBits(this.getHeight());
        result = result * 59 + Float.floatToIntBits(this.getWeight());
        Object $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        return result;
    }

    public String toString() {
        String var10000 = this.getName();
        return "User(name=" + var10000 + ", age=" + this.getAge() + ", height=" + this.getHeight() + ", weight=" + this.getWeight() + ")";
    }
}
```
@With - додає метод для кожного поля, які роблять клон об'єкта з одним зміненим полем
```java
class User {
    ...
    
    
    public User withName(String name) {
        return this.name == name ? this : new User(name, this.age, this.height, this.weight);
    }

    public User withAge(int age) {
        return this.age == age ? this : new User(this.name, age, this.height, this.weight);
    }

    public User withHeight(float height) {
        return this.height == height ? this : new User(this.name, this.age, height, this.weight);
    }

    public User withWeight(float weight) {
        return this.weight == weight ? this : new User(this.name, this.age, this.height, weight);
    }
}
```

@Builder - генерує методи, якими ми ініціаліхуємо об'єкт по ланцюжку
```java
 public static class UserBuilder {}
```

@NoArgsConstructor - створює конструктор без аргументів
@AllArgsConstructor - створює конструктор з усіма параметрами
@RequiredArgsConstructor - створює конструктор з усіма final полями 

@Getter - додає гетери для всії полів класу
@Setter - додає сетери для всії полів класу
@EqualsAndHashCode - реалізовує методи equals, hashCode
@ToString - реалізовує метод toString
@FieldDefault -  