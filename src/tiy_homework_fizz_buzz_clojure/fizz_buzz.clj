(ns tiy-homework-fizz-buzz-clojure.fizz-buzz)

(defn fizz-buzz [ start end]

  (for [i (range start  end)]

    (if (= (mod i 15) 0)
      (str  "fizzbuzz")
      (if (= (mod  i 3) 0)
        (str  "fizz")
        (if (= (mod i 5) 0)
          (str  "buzz")
          (str i))))))


(println  (fizz-buzz 1 100))












;  (if (not= end 0)))
  ;    (fizz-buzz start,  (+ end 1)  (str accumulator " " start)))


  ;  (if (= (mod start 15) 0)
  ;    (str  "fizzbuzz")
  ;    (if (= (mod  start 3) 0)
  ;      (str  "fizz")
  ;      (if (= (mod start 5) 0)
  ;        (str  "buzz")))
  ;  (println))


;(println  (fizz-buzz 1 100))

