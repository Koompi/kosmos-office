(ns app.renderer.state
    (:require [reagent.core :refer [atom]]))

(def activeTab (atom {:tab "2"}))

(def tabs (atom [
                 {:id "1" :name "Home"}
                 {:id "2" :name "Insert"}
                 {:id "3" :name "Layout"}
                 {:id "4" :name "Reference"}
                 {:id "5" :name "Review"}
                 {:id "6" :name "View"}]))
