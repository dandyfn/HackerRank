int jumlahnumber = input.nextInt();
       ArrayList<ArrayList<Integer>> numberatas=new ArrayList<>();
       for (int i = 0; i < jumlahnumber; i++) {
        int apanumberatas = input.nextInt();
        ArrayList<Integer>numberbawah=new ArrayList<>();
       for (int j = 0; j < apanumberatas; j++) {
         int apanumberbawah = input.nextInt();
            numberbawah.add(apanumberbawah);
       }
      numberatas.add(numberbawah);
       }
      // System.out.println(numberatas);
       
      int caritotalangka = input.nextInt();
      for (int i = 0; i < caritotalangka; i++) {
         int angkaatas = input.nextInt();
        int angkabawah = input.nextInt();
        try {
            System.out.println(numberatas.get(angkaatas-1).get(angkabawah-1));
        } catch (Exception e) {
            System.out.println("ERROR !");
        }
      }
