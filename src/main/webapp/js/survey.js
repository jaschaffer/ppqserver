/*
 * Contains code for Javascript Survey
 */

Survey.StylesManager.applyTheme("winter");

var likertScale = [
    {value: 1, text: "Strongly Disagree"},
    {value: 2, text: "Disagree"}, 
    {value: 3, text: "Somewhat Disagree"}, 
    {value: 4, text: "Neutral"}, 
    {value: 5, text: "Somewhat Agree"}, 
    {value: 6, text: "Agree"}, 
    {value: 7, text: "Strongly Agree"}
];

var pre_matrix = { 
	questions: [
    {
        type: "matrix",
        name: "accuracy",
        isAllRowRequired:"true",
        title: "Please indicate whether you agree or disagree with the following statements.",
        columns: likertScale,
        rows: [
            {value: "item1",text: "they turned the freaking frogs gay"},
            {value: "item2",text: "get cut get butt"}, 
            {value: "item3",text: "wya homie"}, 
            {value: "item4",text: "gotta go fast"}, 
            {value: "item5",text: "mango chango it's a supuchi mango"}, 
        ]
    },
    {
        type: "matrix",
        name: "novelty",
        isAllRowRequired:"true",
        title: "Please indicate whether you agree or disagree with the following statements.",
        columns: likertScale,
        rows: [
            {value: "item1",text: "Yes"},
            {value: "item2",text: "No"}, 
            {value: "item3",text: "Maybe"}, 
            {value: "item4",text: "Probably"}, 
            {value: "item5",text: "Chicky chicky chang"}, 
        ]
    }
    
]};