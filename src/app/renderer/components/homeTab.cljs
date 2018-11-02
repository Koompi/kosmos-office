(ns app.renderer.components.homeTab)

(defn homeTab
  []
  [:div {:className "ribbonMainGroup"}
   [:ul
    [:li {:data "Undo (Ctrl + Z)" :className "ribbonIcon" :style {:backgroundImage "url('img/undo.png')"}}]
    [:li {:data "Redo (Ctrl + Y)" :className "ribbonIcon" :style {:backgroundImage "url('img/redo.png')"}}]
    [:li {:data "Cut (Ctrl + X)" :className "ribbonIcon" :style {:backgroundImage "url('img/cut.png')"}}]
    [:li {:data "Copy (Ctrl + C)" :className "ribbonIcon" :style {:backgroundImage "url('img/copy.png')"}}]
    [:li {:data "Paste (Ctrl + V)" :className "ribbonIcon" :style {:backgroundImage "url('img/paste.png')"}}]
    [:li {:data "Clipboard" :className "ribbonIcon" :style {:backgroundImage "url('img/clipboard.png')"}}]
    [:li {:data "Format Printer" :className "ribbonIcon" :style {:backgroundImage "url('img/paintBrush.png')"}}]
    [:li {:className "ribbonSep"} "|"]
    [:li {:data "Format Printer" :className "ribbonList"}
     [:form
      [:select {:type "select" :name "fontFamily"}
       [:option {:value "Font 1"} "Font 1"]
       [:option {:value "Font 2"} "Font 2"]
       [:option {:value "Font 3"} "Font 3"]
       [:option {:value "Font 4"} "Font 4"]
       [:option {:value "Font 5"} "Font 5"]]
      [:select {:type "select" :name "fontSize"}
       [:option {:value "1"} "6"]
       [:option {:value "2"} "8"]
       [:option {:value "3"} "9"]
       [:option {:value "4"} "10"]
       [:option {:value "5"} "11"]]]]
    [:li {:data "Increase Font Size (Ctrl + ])" :className "ribbonIcon" :style {:backgroundImage "url('img/increaseFont.png')"}}]
    [:li {:data "Decrease Font Size (Ctrl + [)" :className "ribbonIcon" :style {:backgroundImage "url('img/decreaseFont.png')"}}]
    [:li {:data "Highlight" :className "ribbonIcon" :style {:backgroundImage "url('img/highlight.png')"}}]
    [:li {:data "Font Color" :className "ribbonIcon" :style {:color "red" :fontSize "24px" :lineHeight "39px"}} "A"]
    [:li {:data "Bold" :className "ribbonIcon" :style {:backgroundImage "url('img/bold.png')"}}]
    [:li {:data "Italic" :className "ribbonIcon" :style {:backgroundImage "url('img/italic.png')"}}]
    [:li {:data "Underline" :className "ribbonIcon" :style {:backgroundImage "url('img/underlined.png')"}}]
    [:li {:className "ribbonSep"} "|"]
    [:li {:data "Order List" :className "ribbonIcon" :style {:backgroundImage "url('img/ol.png')"}}]
    [:li {:data "Unorder List" :className "ribbonIcon" :style {:backgroundImage "url('img/ul.png')"}}]
    [:li {:data "Align Left" :className "ribbonIcon" :style {:backgroundImage "url('img/alignLeft.png')"}}]
    [:li {:data "Align Center" :className "ribbonIcon" :style {:backgroundImage "url('img/alignCenter.png')"}}]
    [:li {:data "Align Right" :className "ribbonIcon" :style {:backgroundImage "url('img/alignRight.png')"}}]
    [:li {:data "Align Justify" :className "ribbonIcon" :style {:backgroundImage "url('img/alignJustify.png')"}}]]])
