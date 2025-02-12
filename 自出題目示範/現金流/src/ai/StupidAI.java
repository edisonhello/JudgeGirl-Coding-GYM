//package players;
//
//import players.decisions.Decision;
//import stocks.Order;
//import stocks.Stock;
//import stocks.StockMarket;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//
//public class StupidAI extends AI {
//    private Random random = new Random();
//
//    public StupidAI(StockMarket market) {
//        super(market);
//    }
//
//    @Override
//    public Decision makeDecision(Decision buyStocks, Decision sellStocks, Decision completeTurn) {
//        int action = 1;
//
//        do {
//            action = random.nextInt(3) + 1;
//        } while (ownStocks.size() == 0 && action == 1);
//
//
//        if (action == 2) {
//            boolean allPricesCannotAfford = true;
//            for (Stock stock : market)
//                if (stock.getCurrentPrice() <= money) {
//                    allPricesCannotAfford = false;
//                    break;
//                }
//            if (allPricesCannotAfford)
//                action = 3;
//        }
//
//        System.out.println(action);
//        return action;
//    }
//
//    @Override
//    public Order chooseWhichStockToBuy() {
//        Stock buyStock = null;
//        int randomAmount = random.nextInt(3) + 1;
//        List<Stock> query = new ArrayList<>();
//        for (Stock stock : market)
//            if (stock.getCurrentPrice() * randomAmount <= money)
//                query.add(stock);
//
//        if (query.size() == 0)
//            buyStock = market.getStockById(1);
//        else {
//            int randomPick = random.nextInt(query.size());
//            buyStock = query.get(randomPick);
//        }
//
//        return new Order(this, buyStock.getId(), randomAmount, Order.Type.BUY);
//    }
//
//    @Override
//    public Order chooseWhichStockToSell() {
//        Stock sellStock = null;
//        int picker = 0;
//        for (Stock stock : ownStocks.keySet())
//            if (random.nextBoolean() || ++picker == ownStocks.size()) {
//                sellStock = stock;
//                break;
//            }
//
//
//        int randomAmount = random.nextInt(ownStocks.get(sellStock)) + 1;
//
//        return new Order(this, sellStock.getId(), randomAmount, Order.Type.SELL);
//    }
//
//}
