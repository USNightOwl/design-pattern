# Factory Pattern

![image](https://www.tutorialspoint.com/design_pattern/images/factory_pattern_uml_diagram.jpg)

## Định nghĩa
**Factory Method** (hay còn gọi là virtual constructor) là một Design Pattern thuộc nhóm **Creational Patterns** (Mẫu thiết kế tạo đối tượng), cung cấp một cách để tạo các đối tượng của lớp một cách linh hoạt mà không cần chỉ định rõ kiểu cụ thể của đối tượng nào sẽ được tạo.

Nhiệm vụ của **Factory Pattern** là quản lý và trả về các đối tượng theo yêu cầu, giúp cho việc khởi tạo đổi tượng một cách linh hoạt hơn.

**Factory Pattern** đúng nghĩa là một nhà máy, và nhà máy này sẽ “sản xuất” các đối tượng theo yêu cầu của chúng ta.

Trong **Factory Pattern**, chúng ta tạo đối tượng mà không để lộ logic tạo đối tượng ở phía người dùng và tham chiếu đến đối tượng mới được tạo ra bằng cách sử dụng một interface chung.

**Factory Pattern** được sử dụng khi có một class cha (super-class) với nhiều class con (sub-class), dựa trên đầu vào và phải trả về 1 trong những class con đó.

## Cài đặt Factory Pattern như thế nào?
Một Factory Pattern bao gồm các thành phần cơ bản sau:

- Super Class: môt supper class trong Factory Pattern có thể là một interface, abstract class hay một class thông thường.
- Sub Classes: các sub class sẽ implement các phương thức của supper class theo nghiệp vụ riêng của nó.
- Factory Class: một class chịu tránh nhiệm khởi tạo các đối tượng sub class dựa theo tham số đầu vào. Lưu ý: lớp này là Singleton hoặc cung cấp một public static method cho việc truy xuất và khởi tạo đối tượng. Factory class sử dụng if-else hoặc switch-case để xác định class con đầu ra.