(ns abc088b.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
(def dmy (read-line))
(def lst (read-line))
(def lst (reverse (sort (map #(Integer/valueOf %) (clojure.string/split lst #" ")))))
(defn card[cnt total lst]
  (if lst
    (if (even? cnt)
      #(card (inc cnt) (+ total (first lst) ) (next lst))
      #(card (inc cnt) (- total (first lst) ) (next lst))
      )
    total))
(println (trampoline card 0 0 lst)))

