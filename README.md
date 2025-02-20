# 🎣 Fishing Gear E-Commerce Application

## 🛍️ Overview
Fishing Gear E-Commerce is a **Spring Boot**-based web application that provides a seamless shopping experience for fishing enthusiasts. Users can **browse products, add them to their cart, and make purchases securely**. The application integrates **Spring Security with JWT authentication** for secure user access and includes essential **CRUD operations** for managing products and orders.

---

## ✨ Features

### 🔒 **Authentication & Security**
- Secure **JWT-based authentication**
- User **registration & login** with role-based access
- **Spring Security** for API protection

### 🛒 **E-Commerce Functionalities**
- **Product browsing** with detailed descriptions
- **Shopping cart** to add/remove products
- **Order management** (Create, Update, Delete)

### 🗄️ **Admin Panel**
- Add, update, delete **products**
- Manage **users & orders**
- View sales analytics (future enhancement)

### 💾 **Technology Stack**
- **Backend**: Spring Boot, Spring Security, JWT Authentication
- **Database**: MySQL
- **Version Control**: Git/GitHub

---

## 🚀 Getting Started

### 🛠 Prerequisites
- **Java 17+** (JDK)
- **Spring Boot** (Spring Framework)
- **MySQL** (Database)
- **Postman** (For API Testing)

### 📌 Installation Steps

1️⃣ **Clone the Repository**:
```bash
 git clone https://github.com/your-username/fishing-gear-ecommerce.git
 cd fishing-gear-ecommerce
```

2️⃣ **Configure the Database**:
- Create a **MySQL database** named `spring`
- Update `application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/spring
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

3️⃣ **Run the Application**:
```bash
mvn spring-boot:run
```

4️⃣ **Access the API**:
- Open **Postman** or any API tool
- Register/Login to get a **JWT token**
- Use the token for **authenticated requests**

---

## 🔗 API Endpoints

### 🛡️ **Authentication**
- **`POST /register`** → Register a new user
- **`POST /login`** → Authenticate & get JWT token

### 🛍️ **Product Management**
- **`GET /api/products`** → Get all products
- **`POST /api/products`** *(Admin only)* → Add a new product
- **`PUT /api/products/{id}`** *(Admin only)* → Update product
- **`DELETE /api/products/{id}`** *(Admin only)* → Delete product

### 🛒 **Cart & Orders**
- **`POST /api/cart-items/add`** → Add product to cart
- **`GET /api/cart-items`** → View cart items
- **`DELETE /api/cart-item/{id}`**  → Delete product from cart
-  **`POST /api/orders`** → Add product to cart

---

## 📸 Screenshots
![Homepage](screenshots/homepage.png)  
*Homepage with product listings*

![Cart](screenshots/cart.png)  
*Shopping cart functionality*

---

## 🔮 Future Enhancements
- ✅ Payment Gateway Integration (Stripe, PayPal)
- ✅ RESTful API documentation with Swagger
- ✅ User Profile & Order History
- ✅ Admin Dashboard with Sales Analytics

---

## 🤝 Contribution
Contributions are welcome! To contribute:
1. Fork the repository
2. Create a new branch (`feature/new-feature`)
3. Commit changes and push to GitHub
4. Open a pull request

---

## 📞 Contact
For queries & support:
- **Email**: mekalcheruvunithish2580@gmail.com
- **GitHub**: [nithish-m123](https://github.com/nithish-m123)

---

**Fishing Gear E-Commerce** - "Empowering Anglers, One Click at a Time!" 🎣🛍️

