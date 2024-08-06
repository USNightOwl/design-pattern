# Abstract Factory Pattern

![image](https://www.tutorialspoint.com/design_pattern/images/abstractfactory_pattern_uml_diagram.jpg)

## Định nghĩa

**Abstract Factory pattern** là một trong những **Creational pattern**. Nó là phương pháp tạo ra một Super-factory dùng để tạo ra các Factory khác. Hay còn được gọi là Factory của các Factory. Abstract Factory Pattern là một Pattern cấp cao hơn so với Factory Method Pattern.

Trong Abstract Factory pattern, một interface có nhiệm vụ tạo ra một Factory của các object có liên quan tới nhau mà không cần phải chỉ ra trực tiếp các class của object. Mỗi Factory được tạo ra có thể tạo ra các object bằng phương pháp giống như Factory pattern.

Hãy tưởng tượng, Abstract factory như là một nhà máy lớn chứa nhiều nhà máy nhỏ, trong các nhà máy đó có những xưởng sản xuất, các xưởng đó tạo ra những sản phẩm khác nhau.

## Cài đặt Abstract Factory Pattern như thế nào?

Một Abstract Factory Pattern bao gồm các thành phần cơ bản sau:

- AbstractFactory: Khai báo dạng interface hoặc abstract class chứa các phương thức để tạo ra các đối tượng abstract.
- ConcreteFactory: Xây dựng, cài đặt các phương thức tạo các đối tượng cụ thể.
- AbstractProduct: Khai báo dạng interface hoặc abstract class để định nghĩa đối tượng abstract.
- Product: Cài đặt của các đối tượng cụ thể, cài đặt các phương thức được quy định tại AbstractProduct.
- Client: là đối tượng sử dụng AbstractFactory và các AbstractProduct.
