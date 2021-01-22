package jana.phoneInterview;

import java.util.*;

/**
 * Created on:  Jan 21, 2021
 * Questions:
 */

public class ItemSuggestions {

    public static void main(String[] args) {
//        System.out.println(getLargestAssociation(Arrays.asList(Arrays.asList("item1"))));
//        connectedSum(100000, Arrays.asList(
//                "23860 99865", "50763 32492", "58198 12402", "62324 45154", "36169 83580", "21219 10561", "64338 16841", "93963 37330", "52293 21117", "98456 41445", "47142 27757", "34414 30738", "28760 29337", "72934 4890", "37892 48423", "51764 22578", "87003 66693", "20942 42624", "47275 57808", "97295 41746", "14195 71056", "15630 47987", "28901 7015", "9517 5911", "72772 11344", "15164 7350", "58736 88311", "68189 79792", "14310 1776", "54969 23398", "88625 88066", "87769 27223", "18504 52586", "96007 75361", "57128 59942", "64759 74562", "2909 56019", "6043 96263", "65864 79656", "18383 28056", "74184 31443", "75857 72279", "54565 67645", "89063 12705", "16517 78391", "97346 94262", "33047 90956", "84147 25225", "37934 11392", "55483 16537", "53300 80699", "85328 18686", "20222 75373", "11070 3019", "29898 26384", "57225 61391", "43130 65513", "76251 65756", "41934 33472", "21563 37589", "78585 325", "9733 25954", "74684 55471", "86421 82593", "75608 21840", "83664 52577", "84201 36895", "44987 69874", "81632 21687", "99133 58592", "93040 28430", "83282 92731", "70943 16918", "52230 59942", "50328 60622", "61300 8086", "75923 24391", "77631 27322", "14367 87423", "57025 35005", "41814 7559", "21659 85835", "40981 35911", "87768 25516", "50704 94466", "21763 42611", "85814 23536", "48291 50298", "85433 90805", "94390 47466", "53776 29190", "30149 66822", "29127 36851", "58178 16670", "53838 29454", "11731 62524", "21063 82095", "44443 74920", "42386 36340", "33432 90590", "14562 76418", "71905 95575", "63337 97845", "97416 40920", "7617 1627", "87599 44252", "18210 47675", "56423 13864", "41971 92181", "948 55840", "24368 15435", "81076 89298", "91320 18934", "62912 33", "44627 33628", "20139 8618", "84376 34728", "67212 15440", "96436 2799", "93171 12242", "33467 5657", "75542 17359", "73832 1133", "80048 182", "64394 76840", "93752 9295", "40369 49851", "96784 8270", "68244 46520", "50928 53298", "76239 70722", "72124 17626", "20854 47325", "58353 79196", "87762 97031", "64347 39933", "40640 58514", "50273 37807", "12476 24313", "82740 46097", "80491 98043", "33439 28198", "78007 12204", "3194 30884", "74426 68274", "97374 54089", "97945 73712", "92379 31100", "84723 54150", "62310 89453", "12899 13259", "79939 39890", "20221 97675", "66766 58412", "9971 99808", "43181 84747", "21498 97527", "21700 59501", "78817 86407", "93687 61796", "33629 7614", "83203 89371", "87521 12478", "80319 43942", "12225 33428", "20678 46020", "86484 50186", "48069 5450", "33459 50004", "82465 16617", "73507 81195", "17194 30538", "3781 90321", "85861 80018", "78311 15171", "72108 98574", "90023 77974", "83489 79024", "49660 86332", "74468 63428", "15599 2937", "82968 42489", "53312 89385", "39913 69592", "93507 64262", "21837 62324", "13992 41181", "42918 72606", "91828 28519", "24692 55513", "59599 79409", "39197 56409", "52428 77824", "94480 66180", "50830 34662", "20126 65165", "8575 46277", "14907 87816", "4457 37203", "38629 92147", "72160 68634", "65921 10726", "43424 44749", "70986 93267", "86230 90045", "79202 24781", "31996 2624", "4010 17825", "63548 10693", "85642 32551", "79144 72582", "62051 74047", "56858 64140", "31739 52906", "18381 91650", "13279 72005", "31591 53242", "66879 20140", "97245 47301", "19698 11483", "36678 92426", "28445 8728", "34639 80306", "20346 7379", "94210 30180", "76720 38766", "29218 51569", "62131 70214", "53617 50579", "56525 42189", "27048 34295", "17757 84320", "81091 77672", "87546 94838", "81712 17804", "55200 51311", "79944 31558", "10314 44458", "65098 34327", "48177 91375", "62606 9981", "39780 89699", "12039 45113", "42062 20006", "19975 94277", "3444 90208", "7038 47161", "14715 42720", "58810 3486", "65983 12879", "46256 86931", "96658 35365", "2871 45479", "67349 44346", "32991 92336", "40067 2566", "78525 38908", "26264 24801", "89824 59359", "51024 31923", "30496 4818", "86094 83196", "95659 54619", "24489 86512", "38489 51746", "5027 78940", "80846 20210", "46432 3270", "30366 3138", "17532 80131", "38596 92148", "52602 89862", "12596 40905", "19040 33435", "35885 68753", "58354 37583", "63673 63957", "50793 5665", "32063 90282", "99021 92887", "61204 85534", "86838 2153", "38354 16166", "45256 55122", "38382 18161", "50093 91990", "76464 11149", "82814 93041", "90527 20068", "9451 95207", "19493 76685", "71223 97673", "77417 1887", "34880 11978", "23355 88902", "20790 14133", "92103 17468", "12457 98930", "81915 29465", "52409 19943", "91911 87625", "46304 22623", "64035 20679", "29611 42450", "12339 30668", "99370 45296", "15740 1135", "77315 32913", "9546 98511", "50015 22942", "35711 3260", "26736 39836", "2139 42224", "66351 20800", "57295 19062", "50896 49138", "7966 55827", "25288 76334", "95247 65434", "80195 83718", "96606 72167", "28247 64787", "40404 85317", "12498 80008", "3271 9708", "90480 47381", "10487 46065", "57184 84091", "74819 94056", "5964 7239", "90248 21341", "77619 34953", "43580 3049", "14812 3115", "19154 67861", "21495 27456", "49696 9240", "25160 96006", "9809 33322", "53502 72609", "57686 18609", "66480 28724", "5334 56847", "29771 97707", "37930 29315", "76272 63502", "8886 48262", "78555 53931", "8781 59332", "47094 7725", "43534 57545", "76590 23973", "60005 16792", "85869 82846", "25693 70765", "35596 47266", "3257 11859", "62444 16582", "60315 93850", "38374 5414", "20288 33966", "49331 63458", "91037 10506", "88933 35371", "4592 43246", "79599 83777", "63508 25613", "66132 62973", "17200 49981", "74862 36106", "85068 30428", "95262 74390", "2309 80892", "20325 63337", "89010 50928", "77029 68072", "33468 56111", "88826 77416", "36612 65618", "38406 54781", "86013 25657", "40843 72814", "15149 4122", "94778 98271", "56451 39233", "52411 23818", "15083 62905", "37869 14203", "74512 48197", "47903 45716", "94638 99441", "88868 69875", "78548 63508", "39625 24963", "64966 91152", "81231 52341", "50009 18495", "1193 48394", "54097 70455", "62611 97495", "27677 10266", "26618 86579", "32888 72248", "30355 97703", "47375 18592", "52080 11379", "11164 55147", "40032 30561", "77844 26089", "42329 52792", "37260 82816", "51442 76354", "48502 88529", "68667 25173", "59172 76718", "1566 16793", "89777 29105", "30468 77888", "30500 76608", "18896 32615", "31729 55487", "97189 50497", "69415 70095", "18606 42617", "31650 23480", "72821 37538", "3831 77616", "43027 51706", "26355 96132", "9734 92986", "60987 4132", "36859 543", "29873 72108", "23881 29472", "84662 93881", "71584 34351", "22219 82160", "88289 92339", "88195 49526", "58543 33487", "99975 77520", "6818 13605", "76544 2003", "15105 73325", "84366 59052", "95119 75927", "95562 42427", "73408 6056", "7547 20978", "20761 41622", "91707 52357", "46106 81967", "22789 8023", "79468 26847", "90394 93760", "88585 52779", "9282 9784", "9423 26003", "26168 45012", "22096 24633", "67249 41182", "70597 16435", "82936 94240", "7264 53289", "24078 82788", "41046 98522", "27426 26355", "82416 99117", "97173 79891", "7142 51226", "44103 65097", "6196 84471", "84228 24098", "49675 8177", "4730 56412", "68906 21008", "76629 66328", "52801 84374", "30783 4505", "62032 99545", "16683 34998", "87762 8586", "31925 96878", "20410 60015", "44381 58254", "48357 41519", "28730 79706", "76482 84119", "4397 14061", "40098 84838", "92880 69848", "91095 78237", "9024 56981", "50017 11114", "63022 14850", "50302 39184", "77751 95474", "49070 69784", "19491 37251", "42607 20388", "99190 18545", "4091 49194", "26110 24524", "56118 41066", "86046 95562", "1253 99799", "72260 50986", "60055 5976", "18840 98083", "7988 48613", "73432 42994", "60069 28330", "99087 17512", "25320 59978", "13456 23766", "41819 73434", "57629 77411", "7552 22722", "36618 99148", "42278 65643", "88835 64305", "51290 68804", "22857 70657", "13189 26206", "6354 25802", "80715 53504", "4264 87137", "66162 34578", "41144 9851", "81098 52252", "6060 71329", "13831 30781", "27471 43978", "57483 54163", "20286 82728", "46555 1384", "47572 78323", "20497 57361", "45378 3003", "9083 16689", "30704 41294", "26254 96169", "49856 55354", "66670 11699", "27269 81697", "22283 55246", "43313 94104", "75074 28440", "3718 96129", "76457 50746", "62912 25867", "93888 62225", "28948 65498", "90854 83574", "8604 48619", "7681 79427", "47879 49481", "27522 94827", "85247 19997", "44368 99349", "62931 12742", "98091 78486", "34859 91155", "5301 57768", "69090 81764", "94182 31450", "67177 67511", "46493 94719", "13275 56086", "60577 45976", "21757 82700", "75465 34117", "73704 22811", "38095 74615", "19787 97080", "53141 47776", "79970 48182", "28129 22718", "88839 57093", "15266 21417", "19515 45075", "55801 48588", "68755 76843", "52782 65236", "1226 40230", "33676 76357", "31865 28186", "15628 36610", "71831 90038", "53007 51667", "75753 50680", "29409 67526", "5827 18737", "54447 95238", "71758 17720", "39395 14299", "14617 77817", "55192 34388", "77428 20182", "21291 72173", "45573 50481", "34502 17601", "46121 53902", "23250 22366", "66726 49983", "4554 42200", "91960 22330", "28558 4150", "57789 85672", "18585 50224", "93340 90675", "53465 29539", "53201 95571", "93270 72576", "43199 52873", "19609 83165", "7923 69321", "47300 26517", "79250 97708", "65475 74914", "81658 10307", "83095 96594", "52377 85412", "86359 37914", "62219 10814", "63627 54072", "16399 71074", "17281 89432", "73746 39022", "61286 94956", "47405 36184", "98299 97283", "40461 61680", "80756 1668", "25870 14640", "86684 19305", "1686 51283", "82850 58473", "39739 24552", "5399 8501", "98804 51574", "61253 75723", "91699 42159", "42346 1400", "79889 220", "49129 2994", "18833 79199", "39827 32249", "92682 32455", "57553 36206", "57857 50058", "38674 40572", "61648 14559", "72702 48791", "14160 40018", "66504 64721", "69786 80967", "63784 1997", "17819 10941", "84543 38952", "90916 73855", "78627 14400", "74826 5715", "32485 36639", "43134 9029", "28916 95703", "46707 37785", "35833 27187", "59151 16934", "91999 74909", "16746 77108", "65166 39220", "94204 32626", "81238 77927", "26014 68845", "61808 47636", "17251 33528", "61847 34708", "87407 46133", "69322 27094", "56156 48795", "14167 20984", "10900 23257", "35313 39515", "92556 89125", "71351 64681", "98209 80550", "72969 48181", "27128 70829", "83380 72086", "90078 77353", "96805 76000", "60940 33013", "84395 53860", "74382 54356", "72062 50519", "63612 71670", "65277 55957", "88262 11665", "42210 3276", "23970 39534", "78438 25532", "72481 73896", "24012 16039", "3905 85514", "26772 66925", "61210 78649", "84605 31547", "41146 32534", "13721 67789", "15459 49682", "40037 71301", "71637 17616", "56411 447", "33331 41099", "39736 27997", "67228 43023", "88802 28545", "95324 63912", "26339 25180", "9388 12299", "6821 74101", "27878 31268", "85357 61696", "44629 50032", "32414 24997", "93362 83696", "24109 83506", "92367 29164", "98483 88026", "39717 80694", "44399 50472", "892 54679", "81654 17541", "67949 69978", "98362 90655", "72182 77504", "34835 74811", "676 70731", "41968 59730", "1242 37433", "96505 98141", "59938 32170", "25597 48093", "682 58925", "78706 88847", "87467 53774", "86174 3220", "6226 48585", "60674 43157", "65622 78481", "30288 59880", "83878 68166", "40072 85122", "22194 95199", "22778 95765", "84415 81919", "18771 80614", "27278 11954", "20202 55117", "15943 2119", "25144 37477", "15430 85997", "13681 7938", "30196 81590", "99809 21935", "91286 22206", "70544 37351", "43292 27063", "96787 46307", "1879 76113", "89232 72696", "36643 32198", "77031 8124", "83827 22870", "6932 10937", "8733 54088", "96260 85724", "18615 78496", "24364 93961", "73452 82077", "14074 20399", "54164 84737", "37202 34345", "25704 72732", "76289 40170", "75897 93839", "88563 7162", "19976 49773", "47449 5281", "35495 14608", "82032 50425", "32588 92817", "95468 80476", "70561 6032", "19660 41720", "3317 63736", "55358 64139"
//        ));
        System.out.println(connectedSum(100, Arrays.asList(
                "19 100", "22 72", "31 47", "59 100", "95 5", "57 12", "8 29", "100 22", "55 73", "90 1", "57 17", "93 13", "3 59", "84 37", "18 21", "47 86", "72 80", "53 99", "98 7", "49 29", "93 60", "78 88", "20 94", "85 36", "83 70", "30 99", "27 97", "7 22", "29 69", "9 17", "68 98", "27 15", "11 39", "58 62", "100 75", "30 17", "34 58", "6 51", "73 17", "97 8", "81 71", "64 49", "50 80", "18 17", "94 73", "20 8", "38 62", "88 39", "27 53", "7 21", "29 4", "38 57", "38 60", "33 32", "87 43", "45 14", "4 87", "95 85", "23 85", "19 39", "75 89", "29 5", "35 54", "57 11", "8 80", "63 39", "32 48", "47 73", "62 99", "22 63", "33 59", "100 88", "64 26", "13 30", "64 41", "89 6", "88 59", "27 85", "39 66", "46 58", "80 23", "69 80", "59 18", "77 18", "94 2", "63 78", "19 72", "61 72", "32 67", "21 49", "26 5", "49 22", "26 6", "22 36", "31 27", "89 70", "41 29", "2 74", "67 3", "51 98", "97 16", "91 79", "91 42", "71 73", "49 88", "3 85", "92 85", "46 44", "45 35", "2 3", "19 99", "1 48", "55 69", "93 50", "63 8", "84 39", "53 74", "31 96", "75 16", "49 52", "82 70", "92 27", "75 3", "56 89", "17 39", "77 43", "72 96", "10 99", "11 75", "51 50", "95 66", "4 57", "23 6", "56 76", "93 48", "6 48", "28 31", "67 43", "98 13", "5 90", "48 94", "42 73", "55 24", "56 84", "17 26", "35 70", "34 52", "100 73", "50 34", "98 48", "72 45", "46 72", "62 100", "39 10", "43 22", "3 16", "21 40", "64 28", "53 18", "24 31", "76 52", "34 48", "67 37", "22 16", "96 23", "2 6", "86 52", "25 8", "65 60", "52 95", "75 86", "63 60", "41 72", "14 40", "62 68", "99 4", "20 41", "40 90", "12 85", "94 37", "64 89", "88 98", "95 33", "20 47", "31 48", "96 79", "88 61", "84 22", "24 12", "39 15", "78 3", "51 89", "38 51", "54 69", "48 88", "42 40", "72 3", "28 66", "21 52", "73 60"
        )) + " = 1");
    }

    static int count;

    public static int connectedSum(int n, List<String> edges) {
        count = 0;
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            graph.put(i, new HashSet<>());
        }
        for (String edge : edges) {
            String[] nodes = edge.split(" ");
            int from = Integer.parseInt(nodes[0]), to = Integer.parseInt(nodes[1]);
            if (from == to) continue;
            graph.get(from).add(to);
            graph.get(to).add(from);
        }
        boolean[] visited = new boolean[n + 1];
        int totalCost = 0, dfsScore = 0;
        for (int i = 1; i <= n; i++) {
            if (visited[i]) continue;
//            dfs(i, graph, visited);
//            dfsScore += (int) Math.ceil(Math.sqrt(count));
//            System.out.println("DFS Count" + (int) Math.ceil(Math.sqrt(count)));
            int len = bfs(i, graph, visited);
            int curScore = (int) Math.ceil(Math.sqrt(len));
            totalCost += curScore;
            System.out.println("BFS Count " + len);
            count = 0;
        }
        return totalCost;
    }

    private static int bfs(int cur, Map<Integer, Set<Integer>> graph, boolean[] visited) {
        int count = 0;
        Deque<Integer> queue = new ArrayDeque<>();
        queue.add(cur);
        while (!queue.isEmpty()) {
            int node = queue.poll();
            if (!visited[node]) {
                visited[node] = true;
                count++;
                for (int dep : graph.get(node)) {
                    if (visited[dep]) continue;
                    queue.add(dep);
                }
            }
        }
        return count;
    }

    private static void dfs(int cur, Map<Integer, Set<Integer>> graph, boolean[] visited) {
        if (visited[cur]) return;
        visited[cur] = true;
        count++;
        for (int next : graph.get(cur)) {
            dfs(next, graph, visited);
        }
    }
}
