(ns app.renderer.components.header
    (:require   [app.renderer.state :refer [tabs]]
                [app.renderer.state :refer [activeTab]]
                [app.renderer.components.homeTab :refer [homeTab]]
                [app.renderer.components.insertTab :refer [insertTab]]
                [app.renderer.components.layoutTab :refer [layoutTab]]
                [app.renderer.components.referencesTab :refer [referencesTab]]
                [app.renderer.components.reviewTab :refer [reviewTab]]
                [app.renderer.components.viewTab :refer [viewTab]]))

(defn switchTab [id]
    (swap! activeTab assoc :tab id))

(defn header []
 (println @tabs)
 [:div {:className "header"}
     [:div {:className "titleBar"} "KOSMOS DOCUMENT"]
     [:div {:className "menuBar"}
         [:ul
          [:li "File"]
          (doall (map (fn [tab]
                       [:li
                           {
                               :key (:id tab)
                               :className (if (=(get-in @activeTab [:tab]) (:id tab)) "active" "")
                               :onClick (fn [] (switchTab (:id tab)))}

                        (:name tab)]) @tabs))]]

     [:div {:className "ribbonContainer"}
         (if (= (get-in @activeTab [:tab]) "1") [homeTab])
         (if (= (get-in @activeTab [:tab]) "2") [insertTab])
         (if (= (get-in @activeTab [:tab]) "3") [layoutTab])
         (if (= (get-in @activeTab [:tab]) "4") [referencesTab])
         (if (= (get-in @activeTab [:tab]) "5") [reviewTab])
         (if (= (get-in @activeTab [:tab]) "6") [viewTab])]])
