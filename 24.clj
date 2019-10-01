;; Title: Sum it all up
;; Link: http://www.4clojure.com/problem/24
;; Description: Write a function which returns the sum of a sequence of numbers.

;; QUESTION/TEST CODE

(= (__ [1 2 3]) 6)
(= (__ (list 0 -2 5 5)) 8)
(= (__ #{4 2 1}) 7)
(= (__ '(0 0 -1)) -1)
(= (__ '(1 10 3)) 14)

;; SOLUTION CODE

#(reduce + %)
