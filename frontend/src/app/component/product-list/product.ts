export class Product {
    constructor(
        public sku: string,
        public name: string,
        public description: string,
        public unitPrice: number,
        public stock: number,
        public imagUrl: string,
        public active: boolean,
        public created: Date,
        public updated: Date
    ) { }
}