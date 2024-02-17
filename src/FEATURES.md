# 🚀 linkedlist.MyLinkedList 기능 정의서


## ListNode

---

- ListNode 클래스는 MyLinkedList의 노드를 표현합니다.
- 각 노드는 데이터를 저장하고, 다음 노드를 가리키는 참조를 가집니다.
- 데이터 타입은 제네릭을 사용하여 어떤 타입이든 저장할 수 있도록 합니다.

## MyLinkedList

---

- MyLinkedList 클래스는 Singly LinkedList를 표현합니다.
- 리스트의 첫 번째 노드를 가리키는 'head' 래퍼런스와 리스트의 길이를 저장하는 'size' 변수를 가집니다.
- 다음과 같은 메서드를 제공합니다: 
  - **add()**: 리스트의 마지막에 새로운 노드를 추가합니다.
  - **get(index)**: 리스트의 index번째 노드의 데이터를 반환합니다.
  - **delete(index)**: 리스트의 index번째 노드를 삭제합니다.

## ListIterator

---

- ListIterator 인터페이스는 Iterator 패턴을 구현합니다.
- MyLinkedList 클래스는 이 인터페이스를 구현하여 for-each 문으로 순회할 수 있도록 합니다.
- 다음과 같은 메서드를 제공합니다.
  - **hasNext()**: 순회할 다음 노드가 있는지 확인합니다.
  - **next()**: 다음 노드를 반환합니다.