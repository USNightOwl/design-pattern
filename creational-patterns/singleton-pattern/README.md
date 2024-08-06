# Singleton Pattern
![image](https://www.tutorialspoint.com/design_pattern/images/singleton_pattern_uml_diagram.jpg)

## Định nghĩa

**Singleton** là 1 trong 5 design pattern của nhóm **Creational Design Pattern**.

**Singleton** đảm bảo chỉ duy nhất một thể hiện (instance) được tạo ra và nó sẽ cung cấp cho bạn một method để có thể truy xuất được thể hiện duy nhất đó mọi lúc mọi nơi trong chương trình.

Sử dụng **Singleton** khi chúng ta muốn:

- Đảm bảo rằng chỉ có một instance của lớp.
- Việc quản lý việc truy cập tốt hơn vì chỉ có một thể hiện duy nhất.
- Có thể quản lý số lượng thể hiện của một lớp trong giớn hạn chỉ định.

## Cài đặt Singleton Pattern như thế nào?

Có rất nhiều cách để implement Singleton Pattern. Nhưng dù cho việc implement bằng cách nào đi nữa cũng dựa vào nguyên tắc dưới đây cơ bản dưới đây:

- private constructor để hạn chế truy cập từ class bên ngoài.
- Đặt private static final variable đảm bảo biến chỉ được khởi tạo trong class.
- Có một method public static để return instance được khởi tạo ở trên.
