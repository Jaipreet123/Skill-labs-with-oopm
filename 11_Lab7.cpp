#include <iostream>
using namespace std;

class Marks {
    private:
        int meter;
               
    public:
        Marks() {
			meter=0;
		}
	    friend int addTen(Marks);
        
};
int addTen(Marks m) {

    m.meter += 10;
    return m.meter;
}

int main() {
    Marks m;
    cout << "Marks: "<<addTen(m);

    return 0;
}
