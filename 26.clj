;; Title: Fibonacci Sequence
;; Link: http://www.4clojure.com/problem/26
;; Description: Write a function which returns the first X fibonacci numbers.

;; QUESTION/TEST CODE

(= (__ 3) '(1 1 2))
(= (__ 6) '(1 1 2 3 5 8))
(= (__ 8) '(1 1 2 3 5 8 13 21))

;; SOLUTION CODE

#(take % ((fn fib [a b] (lazy-seq (cons a (fib b (+ a b))))) 0 1))
