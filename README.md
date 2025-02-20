# 🎣 Fishing Gear E-Commerce Application

## 🛍️ Overview
Fishing Gear E-Commerce is a **Spring Boot**-based web application that provides a seamless shopping experience for fishing enthusiasts. Users can **browse products, add them to their cart, and make purchases securely**. The application integrates **Spring Security with JWT authentication** for secure user access and includes essential **CRUD operations** for managing products and orders.

![FishingGear](https://img.shields.io/badge/FishingGear-Shop%20Fishing%20Essentials-blue?style=for-the-badge&logo=spring&logoColor=white)  
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-Backend-green?style=for-the-badge&logo=springboot&logoColor=white)  
![MySQL](https://img.shields.io/badge/MySQL-Database-orange?style=for-the-badge&logo=mysql&logoColor=white)  
![JWT](https://img.shields.io/badge/JWT-Authentication-red?style=for-the-badge&logo=jsonwebtokens&logoColor=white)  
![E-Commerce](https://img.shields.io/badge/E--Commerce-Application-purple?style=for-the-badge&logo=google-shopping&logoColor=white)  

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
 git clone https://github.com/nithish-m123/FishingGear.git
 cd FishingGear
```

2️⃣ **Configure the Database**:
- import database **spring.sql**
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
🔐✅**Registration** 
![Registration](Fishing%20Gear/new%20User.png)
*New User Registration*
- Password is Encrypted

🔐✅**Authentication** 
![Login](Fishing%20Gear/Login.png)  
*User Authentication*
- It generates JWT token if an user successfully authorized.
- The Token is valid for 3 minutes(for development purpose).
- 
 🛍️📦**Products**
![Products](Fishing%20Gear/products.png)  
*Product Browsing*
- Available products are listed here.

🛒🧾**Cart Items**

![Cart-Items](Fishing%20Gear/cart-items.png)  
*Cart Items*
- Cart Items are listed here.

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

