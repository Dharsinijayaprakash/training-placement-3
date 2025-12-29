queue = []

while True:
    print("\n1.Enqueue 2.Dequeue 3.Display 4.Exit")
    choice = int(input("Enter choice: "))

    if choice == 1:
        queue.append(int(input("Enter value: ")))

    elif choice == 2:
        if queue:
            print("Deleted:", queue.pop(0))
        else:
            print("Queue Empty")

    elif choice == 3:
        print("Queue:", queue)

    elif choice == 4:
        break
