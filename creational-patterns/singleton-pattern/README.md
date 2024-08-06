# Singleton Pattern
![image](https://www.tutorialspoint.com/design_pattern/images/singleton_pattern_uml_diagram.jpg)

## Định nghĩa

**Singleton** là 1 trong 5 design pattern của nhóm **Creational Design Pattern**.

**Singleton** đảm bảo chỉ duy nhất một thể hiện (instance) được tạo ra và nó sẽ cung cấp cho bạn một method để có thể truy xuất được thể hiện duy nhất đó mọi lúc mọi nơi trong chương trình.

Sử dụng **Singleton** khi chúng ta muốn:

- Đảm bảo rằng chỉ có một instance của lớp.
- Việc quản lý việc truy cập tốt hơn vì chỉ có một thể hiện duy nhất.
- Có thể quản lý số lượng thể hiện của một lớp trong giớn hạn chỉ định.

## Tại sao cần dùng Singleton Pattern?

Hầu hết các đối tượng trong một ứng dụng đều chịu trách nhiệm cho công việc của chúng và truy xuất dữ liệu tự lưu trữ (self-contained data) và các tham chiếu trong phạm vi được đưa ra của chúng. Tuy nhiên, có nhiều đối tượng có thêm những nhiệm vụ và có ảnh hưởng rộng hơn, chẳng hạn như quản lý các nguồn tài nguyên bị giới hạn hoặc theo dõi toàn bộ trạng thái của hệ thống. Ví dụ có thể có rất nhiều máy in trong hệ thống nhưng chỉ có thể tồn tại duy nhất một Sprinter Spooler (Phần quản lý máy in)

Giả sử trong ứng dụng có chức năng bật tắt nhạc nền chẳng hạn, khi người dùng mở app thì ứng dụng sẽ tự động mở nhạc nền và nếu người dùng muốn tắt thì phải vào setting trong app để tắt nó, trong setting của app cho phép người dùng quản lí việc mở hay tắt nhạc, và trong trường hợp này bạn sẽ cần sử dụng singleton để quản lí việc này. Chắc chắn bạn phải cần duy nhất 1 instance để có thể ra lệnh bật hay tắt, tại sao ? vì đơn giản bạn không thể tạo 1 instance để mở nhạc rồi sau đó lại tạo 1 instance khác để tắt nhạc, lúc này sẽ có 2 instance được tạo ra, 2 instance này không liên quan đến nhau nên không thể thực hiện thực hiện việc cho nhau được, bạn phải hiểu rằng instance nào bật thì chỉ có instance đó mới được phép tắt nên dẫn đến phải cần 1 instance.

## Cài đặt Singleton Pattern như thế nào?

Có rất nhiều cách để implement Singleton Pattern. Nhưng dù cho việc implement bằng cách nào đi nữa cũng dựa vào nguyên tắc dưới đây cơ bản dưới đây:

- private constructor để hạn chế truy cập từ class bên ngoài.
- Đặt private static final variable đảm bảo biến chỉ được khởi tạo trong class.
- Có một method public static để return instance được khởi tạo ở trên.

1. Làm sao để 1 class chỉ có thể có duy nhất 1 instance?
- Private constructor của class đó để đảm bảo rằng class lớp khác không thể truy cập vào constructor và tạo ra instance mới
- Tạo một biến private static là thể hiện của class đó để đảm bảo rằng nó là duy nhất và chỉ được tạo ra trong class đó thôi.

2. Làm sao để có thể ccung cấp một cáchs toàn cầu để truy cấp tới instance đó.
- Tạo một public static menthod trả về instance vừa khởi tạo bên trên, đây là cách duy nhất để các class khác có thể truy cập vào instance của class này

## Những cách nào để implement Singleton Pattern

### Eager initialization
```java
public class EagerInitializedSingleton {

   private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

   //private constructor to avoid client applications to use constructor
   private EagerInitializedSingleton(){}

   public static EagerInitializedSingleton getInstance(){
       return instance;
   }
}
```

Đây là cách dễ nhất nhưng nó có một nhược điểm là mặc dù instance đã được khởi tạo nhưng có thể sẽ không dùng tới. vì vậy chúng ta có cách thứ 2.

### Lazy initialization

```java
public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton(){}

    public static LazyInitializedSingleton getInstance(){
        if(instance == null){
            instance = new LazyInitializedSingleton();
        }

        return instance;
    }
}
```

Cách này đã khắc phục được nhược điểm của cách 1 Eager initialization, chỉ khi nào geInstance được gọi thì instance mới được khởi tạo. Tuy nhiên cách này chỉ sử dụng tốt trong trường hợp đơn luồng, trường hợp nếu có 2 luồng cùng chạy và cùng gọi hàm getInstance tại cùng một thời điểm thì đương nhiên chúng ta có ít nhất 2 thể hiện của instance. Vậy ta phải làm sao với trường hợp đa luồng. chúng ta đi tới cách tiếp theo

### Thread Safe initialization
```java
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){}

    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingleton();
        }

        return instance;
     }
```

