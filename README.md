# RestoPress Backend API

**RestoPress** is a scalable SaaS (Software as a Service) backend designed to digitize restaurant operations. It solves the problem of static, unmanageable menus by providing a centralized Content Management System (CMS) for restaurant owners.

Unlike simple CRUD apps, RestoPress implements a robust **relational data model**, allowing a single system to host multiple restaurants with complex nested menu structures.

### Key Technical Highlights
* **Architecture:** Built on the industry-standard **3-Layer Architecture** (Controller → Service → Repository) to ensure separation of concerns and maintainability.
* **Data Modeling:** Implements complex JPA relationships (**One-to-Many**) to link Restaurants with their Menu Items dynamically.
* **API Standards:** Fully RESTful endpoints returning strict JSON structures, documented via **OpenAPI/Swagger**.
* **Validation:** Robust input validation at the DTO level to prevent data corruption.

---
