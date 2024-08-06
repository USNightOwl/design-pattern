# Nhóm Creational (nhóm khởi tạo)
![image](https://gpcoder.com/wp-content/uploads/2018/08/Creational.png)

Factory Method, Abstract Factory, Builder, Prototype, Singleton. Những Design pattern loại này cung cấp một giải pháp để tạo ra các object và che giấu được logic của việc tạo ra nó, thay vì tạo ra object một cách trực tiếp bằng cách sử dụng method new. Điều này giúp cho chương trình trở nên mềm dẻo hơn trong việc quyết định object nào cần được tạo ra trong những tình huống được đưa ra.

## Singleton:
- Đảm bảo 1 class chỉ có 1 instance và cung cấp 1 điểm truy xuất toàn cục đến nó.
- Tần suất sử dụng: :star: :star: :star: :star: cao trung bình.

## Abstract Factory:
- Cung cấp một interface cho việc tạo lập các đối tượng (có liên hệ với nhau) mà không cần qui định lớp khi hay xác định lớp cụ thể (concrete) tạo mỗi đối tượng.
- Tần suất sử dụng: :star: :star: :star: :star: :star: cao.

## Factory Method:
- Định nghĩa Interface để sinh ra đối tượng nhưng để cho lớp con quyết định lớp nào được dùng để sinh ra đối tượng Factory method cho phép một lớp chuyển quá trình khởi tạo đối tượng cho lớp con.
- Tần suất sử dụng: :star: :star: :star: :star: :star: cao.

## Builder:
- Tách rời việc xây dựng (construction) một đối tượng phức tạp khỏi biểu diễn của nó sao cho cùng một tiến trình xây dựng có thể tạo được các biểu diễn khác nhau.
- Tần suất sử dụng: :star: :star: trung bình thấp.

## Prototype:
- Qui định loại của các đối tượng cần tạo bằng cách dùng một đối tượng mẫu, tạo mới nhờ vào sao chép đối tượng mẫu này.
- Tần suất sử dụng: :star: :star: :star: trung bình.