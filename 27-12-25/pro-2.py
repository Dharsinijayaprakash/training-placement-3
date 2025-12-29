class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None

    def insert(self, data):
        new = Node(data)
        if not self.head:
            self.head = new
            return
        temp = self.head
        while temp.next:
            temp = temp.next
        temp.next = new

    def delete(self):
        if self.head:
            self.head = self.head.next

    def display(self):
        temp = self.head
        while temp:
            print(temp.data, end=" -> ")
            temp = temp.next
        print("None")

ll = LinkedList()

while True:
    print("\n1.Insert 2.Delete 3.Display 4.Exit")
    ch = int(input("Enter choice: "))

    if ch == 1:
        ll.insert(int(input("Enter value: ")))
    elif ch == 2:
        ll.delete()
    elif ch == 3:
        ll.display()
    elif ch == 4:
        break
