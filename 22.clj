;; Title: Count a sequence
;; Link: http://www.4clojure.com/problem/22
;; Description: Write a function which returns the total number of elements in a sequence.

;; QUESTION/TEST CODE

;; (= (__ '(1 2 3 3 1)) 5)
;; (= (__ "Hello World") 11)
;; (= (__ [[1 2] [3 4] [5 6]]) 3)
;; (= (__ '(13)) 1)
;; (= (__ '(:a :b :c)) 3)

;; SOLUTION CODE

#(reduce (fn [value coll] (inc value)) 0 %)
