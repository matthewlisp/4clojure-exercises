;; Title: Palindrome Detector
;; Link: http://www.4clojure.com/problem/27
;; Description:Write a function which returns true if the given sequence is a palindrome. 

;; QUESTION/TEST CODE

(false? (__ '(1 2 3 4 5)))
(true? (__ "racecar"))
(true? (__ [:foo :bar :foo]))
(true? (__ '(1 1 3 3 1 1)))
(false? (__ '(:a :b :c)))

;; SOLUTION CODE

(fn [s] (= s
           (#(if-let [value (string? %)]
               (apply str (reverse %))
               (reverse %)) s)))
