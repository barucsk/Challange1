(load "clips/prodcust/load-prod-cust.clp") 
(load "clips/prodcust/load-prodcust-rules.clp")
(reset)
*****************************************************************
(printout t "Current stored facts in CLIPS Working Memory:" crlf)
(facts)
*****************************************************************
************************Execute**********************************
(run)
*****************************************************************
************************End**************************************
(clear)  
