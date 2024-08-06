# Prototype Pattern

## Định nghĩa
**Prototype pattern** là một trong những **Creational pattern**. Nó có nhiệm vụ khởi tạo một đối tượng bằng cách clone một đối tượng đã tồn tại thay vì khởi tạo với từ khoá new. Đối tượng mới là một bản sao có thể giống 100% với đối tượng gốc, chúng ta có thể thay đổi dữ liệu của nó mà không ảnh hưởng đến đối tượng gốc.

Prototype Pattern được dùng khi việc tạo một object tốn nhiều chi phí và thời gian trong khi bạn đã có một object tương tự tồn tại.

Trong Java cung cấp mẫu prototype pattern này bằng việc implement interface Cloneable và sử dụng method clone() để tạo object có đầy đủ thuộc tính của đối tượng ban đầu. Các bạn có thể xem lại bài viết về Object cloning trong java để hiểu thêm về interface Clonable trước khi tiếp tục xem phần tiếp theo của bài viết này.

## Cài đặt Prototype Pattern như thế nào ?

Một Prototype Pattern gồm các thành phần cơ bản sau:

- Prototype : khai báo một class, interface hoặc abtract class cho việc clone chính nó.
- ConcretePrototype class : các lớp này thực thi interface (hoặc kế thừa từ lớp abstract) được cung cấp bởi Prototype để copy (nhân bản) chính bản thân nó. Các lớp này chính là thể hiện cụ thể phương thức clone(). Lớp này có thể không cần thiết nếu: Prototype là một class và nó đã implement việc clone chính nó.
- Client class : tạo mới object bằng cách gọi Prototype thực hiện clone chính nó.
