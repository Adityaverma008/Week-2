class Product:
    # Class variable to keep track of total products
    totalProducts = 0

    def __init__(self, productName, price):
        self.productName = productName
        self.price = price
        Product.totalProducts += 1  # Increment total products when a new product is created

    def displayProductDetails(self):
        # Display details of the product
        print(f"Product Name: {self.productName}, Price: {self.price}")

    @classmethod
    def displayTotalProducts(cls):
        # Display total products created
        print(f"Total Products: {cls.totalProducts}")


# Example Usage
product1 = Product("Laptop", 1500)
product2 = Product("Phone", 800)

product1.displayProductDetails()
product2.displayProductDetails()

Product.displayTotalProducts()
